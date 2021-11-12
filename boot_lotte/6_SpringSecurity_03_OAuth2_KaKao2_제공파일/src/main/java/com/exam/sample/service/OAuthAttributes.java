package com.exam.sample.service;

import java.util.Map;

import com.exam.sample.entity.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String name;
    private String email;
    private String picture;

    public OAuthAttributes(Map<String, Object> attributes, String nameAttributeKey, String name, String email, String picture) {
        this.attributes = attributes;
        this.nameAttributeKey = nameAttributeKey;
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public OAuthAttributes() {
    }

    // userNameAttributeName은 해당 서비스의 map의 키값이 되는 값 ==>  {google="sub", kakao="id", naver="response"}
    public static OAuthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object> attributes) {
        if (registrationId.equals("kakao")) {
            return ofKakao(userNameAttributeName, attributes);
        } 
        return ofKakao(userNameAttributeName, attributes);
    }

    private static OAuthAttributes ofKakao(String userNameAttributeName, Map<String, Object> attributes) {
    	System.out.println("attributes>>>>>>>>>>>>>" + attributes);
        Map<String, Object> kakao_account = (Map<String, Object>) attributes.get("kakao_account");  
        Map<String, Object> profile = (Map<String, Object>) kakao_account.get("profile");   

        return new OAuthAttributes(attributes,
                userNameAttributeName,
                (String) profile.get("nickname"),
                (String) kakao_account.get("email"),
                (String) profile.get("profile_image_url"));
    }

    public User toEntity() {
    	User user = User.builder()
    			    .name(name)
    			    .email(email)
    			    .picture(picture)
    			    .build();
        return user;
    }
}



