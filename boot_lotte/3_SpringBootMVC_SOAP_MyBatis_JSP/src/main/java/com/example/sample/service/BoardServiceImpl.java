package com.example.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.dto.BoardDTO;
import com.example.sample.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepository boardRepository;
	
	
	@Override
	public int insertBoard(BoardDTO board) throws Exception {
		// TODO Auto-generated method stub
		return boardRepository.insertBoard(board);
	}


	@Override
	public List<BoardDTO> selectAllBoard() throws Exception {
		// TODO Auto-generated method stub
		return boardRepository.selectAllBoard();
	}


	@Override
	public BoardDTO selectBoardByNum(int num) throws Exception {
		// TODO Auto-generated method stub
		return boardRepository.selectBoardByNum(num);
	}


	@Override
	public int deleteBoard(int num) throws Exception {
		// TODO Auto-generated method stub
		return boardRepository.deleteBoard(num);
	}

}
