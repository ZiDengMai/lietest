package com.mzd.lietest;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;

public class TestChat {
    @Test
    void test01(){
        ChatLanguageModel chatLanguageModel = OpenAiChatModel.builder().apiKey("demo").modelName("gpt-4o-mini").build();
        String ans = chatLanguageModel.generate("hello, who are you");
        System.out.println(ans);
    }
}
