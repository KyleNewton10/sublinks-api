package com.sublinks.sublinksapi.customemoji.services;

import com.sublinks.sublinksapi.customemoji.dto.CustomEmoji;
import com.sublinks.sublinksapi.customemoji.dto.CustomEmojiKeyword;
import com.sublinks.sublinksapi.customemoji.repositories.CustomEmojiKeywordRepository;
import com.sublinks.sublinksapi.customemoji.repositories.CustomEmojiRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CustomEmojiServiceTest {

  @Mock
  CustomEmojiRepository emojiRepository;

  @Mock
  CustomEmojiKeywordRepository emojiKeywordRepository;

  @InjectMocks
  CustomEmojiService customEmojiService;

  CustomEmoji emoji;

  CustomEmojiKeyword emojiKeyword;

  @BeforeEach
  public void setup() {
    emoji = CustomEmoji.builder().id(12345L).build();
    when(emojiRepository.save(any())).thenReturn(emoji);
    emojiKeyword = CustomEmojiKeyword.builder().id(123L).emoji(emoji).build();
  }

  @Test
  public void createCustomEmojiTest() {
    List<String> keywords = new ArrayList<>();
    keywords.add("key");
    keywords.add("word");
    CustomEmoji customEmoji = customEmojiService.createCustomEmoji(emoji, keywords);

    assertNotNull(customEmoji.getKeywords());
  }

  @Test
  public void updateCustomEmojiTest() {
    List<String> keywords = new ArrayList<>();
    keywords.add("key");
    keywords.add("word");
    CustomEmoji customEmoji = customEmojiService.createCustomEmoji(emoji, keywords);

    assertEquals(2, customEmoji.getKeywords().size());

    List<String> words = new ArrayList<>();
    words.add("word");
    words.add("test");
    words.add("this");

    customEmojiService.updateCustomEmoji(customEmoji, words);

    assertEquals(3, customEmoji.getKeywords().size());
  }

  @Test
  public void updateCustomEmojiNullListTest() {
    List<String> keywords = new ArrayList<>();
    keywords.add("key");
    keywords.add("word");
    CustomEmoji customEmoji = customEmojiService.createCustomEmoji(emoji, keywords);

    assertEquals(2, customEmoji.getKeywords().size());

    List<String> words = null;

    customEmojiService.updateCustomEmoji(customEmoji, words);

    assertEquals(0, customEmoji.getKeywords().size());
  }
}