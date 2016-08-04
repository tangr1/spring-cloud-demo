package com.github.tangr1.notification.service;

import com.github.tangr1.notification.domain.NotificationType;
import com.github.tangr1.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
