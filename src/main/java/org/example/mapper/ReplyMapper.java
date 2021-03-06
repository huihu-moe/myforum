package org.example.mapper;

import org.example.model.Comment;
import org.example.model.Reply;

import java.util.List;


public interface ReplyMapper {

    void insertReply(Reply reply);

    List<Reply> listReply(int pid);

    void insertComment(Comment comment);

    List<Comment> listComment(Integer rid);

    String getContentByRid(int rid);

}
