package org.example.mapper;

import org.example.model.Message;

import java.util.List;


public interface MessageMapper {

    void insertMessage(Message message);

    List<Message> listMessageByUid(Integer uid);


}
