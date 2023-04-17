package shop.readmecorp.adminserverreadme.modules.claim.service;

import org.springframework.stereotype.Service;
import shop.readmecorp.adminserverreadme.modules.claim.repository.AnswerRepository;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
}