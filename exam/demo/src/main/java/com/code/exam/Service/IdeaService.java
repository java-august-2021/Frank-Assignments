package com.code.exam.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.exam.Models.Idea;
import com.code.exam.Models.User;
import com.code.exam.Repository.IdeaRepo;

@Service
public class IdeaService {
	@Autowired
	private IdeaRepo iRepo;
	
	public Idea create(Idea idea) {
		return iRepo.save(idea);
	}
	
	public List<Idea> findAllIdea(){
		return iRepo.findAll();
	}
	
	public Idea findIdeaById(Long Id) {
		return this.iRepo.findById(Id).orElse(null);
	}
	
    public List<Idea> getIdeaSortby(){
    	return this.iRepo.findByOrderByNumOfLikesDesc();
    }
	
	public void likeAnIdea(User user, Idea idea) {
		List<User>likedBy=idea.getLikers();
		likedBy.add(user);
		idea.setNumOfLikes(idea.getNumOfLikes()+1);
		this.iRepo.save(idea);
	}
	
	public void unLikeAnIdea(User user, Idea idea) {
		List<User>likedBy=idea.getLikers();
		likedBy.remove(user);
		idea.setNumOfLikes(idea.getNumOfLikes()-11);
		this.iRepo.save(idea);
	}
	
	public void deleteIdea(Long id) {
		iRepo.deleteById(id);
	}

	public Idea updateBook(Long id, String content) {
		// TODO Auto-generated method stub
		Idea thisIdea=findIdeaById(id);
		thisIdea.setContent(content);
		return iRepo.save(thisIdea);
	}
}
