package com.example.sample.service;

import java.util.List;

import com.example.sample.dto.BoardDTO;

public interface BoardService {
	public int insertBoard(BoardDTO board) throws Exception;
	public List<BoardDTO> selectAllBoard() throws Exception;
	public BoardDTO selectBoardByNum(int num) throws Exception;
	public int deleteBoard(int num) throws Exception;
}
