package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin(); //트랜잭션 시작

        try{
            // ** 회원 등록 예제 **
/*            Member member = new Member();
            member.setId(1L);
            member.setName("HelloA");

            em.persist(member);
            tx.commit(); // 트랜잭션 커밋*/

            // ** 회원 수정 예제 **
/*            Member findMember = em.find(Member.class, 1L);

            System.out.println("findMember.id = " + findMember.getId());
            System.out.println("findMember.name = " + findMember.getName());

            findMember.setName("HelloJPA");
            tx.commit(); // 트랜잭션 커밋*/

            // ** JPQL 로 전체회원 조회 예제 **
/*            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();
            for(Member member : result){
                System.out.println("member.name = " + member.getName());
            }
            tx.commit(); // 트랜잭션 커밋*/

            // ** 영속성 컨텍스트 예제 **
            // 비영속 상태
            Member member = new Member();
            member.setId(100L);
            member.setName("HelloJPA");

            // 영속 상태
            em.persist(member);
            em.detach(member); // 준영속 상태

        } catch (Exception e){
            tx.rollback(); // 트랜잭션 롤백
        } finally {
            //close
            em.close();
        }
        emf.close();
    }
}
