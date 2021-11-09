package com.example.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sample.dto.BoardDTO;

@Mapper
public interface BoardRepository {
	// 저장
	public int insertBoard(BoardDTO board) throws Exception;
	
	public List<BoardDTO> selectAllBoard() throws Exception;
	public BoardDTO selectBoardByNum(int num) throws Exception;
	
	public int deleteBoard(int num) throws Exception;
}
