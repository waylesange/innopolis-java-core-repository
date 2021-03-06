/*
 * Copyright (c) 2019. Alexander Tsupko (alexander.tsupko@outlook.com). All rights reserved.
 */

package ru.innopolis.assignments.week2.assignment09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class FindGivenWordsInTheSourcesStreamAPITest {
    private static final String PATH = "./src/test/resources/"; // путь к ресурсам

    private FindGivenWordsInTheSourcesStreamAPI example = null;

    @BeforeEach
    void setUp() {
        example = new FindGivenWordsInTheSourcesStreamAPI();
    }

    @Test
    void testFileGetOccurrences() throws IOException {
        example.getOccurrences(
                new String[] {
                        PATH + "input.txt"
                },
                new String[] {"That", "second", "a", "first", "-", "", null},
                PATH + "output.txt"
        );
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH + "output.txt"))) {
            assertEquals(
                    "This is    \"the second источник\"\n" +
                            "And here is его 'second sentence', too",
                    reader.lines().collect(Collectors.joining("\n"))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testURLGetOccurences() throws IOException {
        example.getOccurrences(
                new String[] {
                        "http://gutenberg.org/zipcat2.php/1342/1342-0.txt", // "Pride and Prejudice" by Jane Austen
                },
                new String[] {"pride"},
                PATH + "output.txt"
        );
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH + "output.txt"))) {
            assertEquals(
                    "Pride relates more to our opinion of ourselves, vanity to what we would have others think of us\n" +
                            "”  “Such as vanity and pride\n" +
                            "They may wish many things besides his happiness; they may wish his increase of wealth and consequence; they may wish him to marry a girl who has all the importance of money, great connections, and pride\n" +
                            "Collins was also in the same state of angry pride\n" +
                            "Indeed he has no improper pride\n" +
                            "”  “Can such abominable pride as his have ever done him good\n" +
                            "But pride--where there is a real superiority of mind, pride will be always under good regulation\n" +
                            "”  “His pride,” said Miss Lucas, “does not offend _me_ so much as pride often does, because there is an excuse for it\n" +
                            "He thought too well of himself to comprehend on what motives his cousin could refuse him; and though his pride was hurt, he suffered in no other way\n" +
                            "But I can guess how it was; everybody says that he is eat up with pride, and I dare say he had heard somehow that Mrs\n" +
                            "Her manners were pronounced to be very bad indeed, a mixture of pride and impertinence; she had no conversation, no style, no beauty\n" +
                            "Darcy, whose pride, she was convinced, would receive a deeper wound from the want of importance in his friend's connections, than from their want of sense; and she was quite decided, at last, that he had been partly governed by this worst kind of pride, and partly by the wish of retaining Mr\n" +
                            "”  “It _is_ wonderful,” replied Wickham, “for almost all his actions may be traced to pride; and pride had often been his best friend\n" +
                            "But we are none of us consistent, and in his behaviour to me there were stronger impulses even than pride\n" +
                            "Family pride, and _filial_ pride--for he is very proud of what his father was--have done this\n" +
                            "They had nothing to accuse him of but pride; pride he probably had, and if not, it would certainly be imputed by the inhabitants of a small market-town where the family did not visit\n" +
                            "But his pride, his abominable pride--his shameless avowal of what he had done with respect to Jane--his unpardonable assurance in acknowledging, though he could not justify it, and the unfeeling manner in which he had mentioned Mr\n" +
                            "Such a change in a man of so much pride exciting not only astonishment but gratitude--for to love, ardent love, it must be attributed; and as such its impression on her was of a sort to be encouraged, as by no means unpleasing, though it could not be exactly defined\n" +
                            "He spoke well; but there were feelings besides those of the heart to be detailed; and he was not more eloquent on the subject of tenderness than of pride\n" +
                            "His pride never deserts him; but with the rich he is liberal-minded, just, sincere, rational, honourable, and perhaps agreeable--allowing something for fortune and figure\n" +
                            "This was a stroke of civility for which she was quite unprepared; and she could hardly suppress a smile at his being now seeking the acquaintance of some of those very people against whom his pride had revolted in his offer to herself\n" +
                            "With what delighted pride she afterwards visited Mrs\n" +
                            "His pride, in that direction, may be of service, if not to himself, to many others, for it must only deter him from such foul misconduct as I have suffered by\n" +
                            "org   Title: Pride and Prejudice  Author: Jane Austen  Posting Date: August 26, 2008 [EBook #1342] Release Date: June, 1998 Last Updated: March 10, 2018  Language: English  Character set encoding: UTF-8  *** START OF THIS PROJECT GUTENBERG EBOOK PRIDE AND PREJUDICE ***     Produced by Anonymous Volunteers      PRIDE AND PREJUDICE  By Jane Austen    Chapter 1   It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife\n" +
                            "I wonder that the very pride of this Mr\n" +
                            "She has the reputation of being remarkably sensible and clever; but I rather believe she derives part of her abilities from her rank and fortune, part from her authoritative manner, and the rest from the pride for her nephew, who chooses that everyone connected with him should have an understanding of the first class\n" +
                            "A fortunate chance had recommended him to Lady Catherine de Bourgh when the living of Hunsford was vacant; and the respect which he felt for her high rank, and his veneration for her as his patroness, mingling with a very good opinion of himself, of his authority as a clergyman, and his right as a rector, made him altogether a mixture of pride and obsequiousness, self-importance and humility\n" +
                            "Everybody is disgusted with his pride\n" +
                            "Reynolds, either by pride or attachment, had evidently great pleasure in talking of her master and his sister\n" +
                            "Vanity and pride are different things, though the words are often used synonymously\n" +
                            "Bennet had been strongly inclined to ask them to stay and dine there that day; but, though she always kept a very good table, she did not think anything less than two courses could be good enough for a man on whom she had such anxious designs, or satisfy the appetite and pride of one who had ten thousand a year\n" +
                            "He generously imputed the whole to his mistaken pride, and confessed that he had before thought it beneath him to lay his private actions open to the world\n" +
                            "It was all pride and insolence\n" +
                            "”  “Pride,” observed Mary, who piqued herself upon the solidity of her reflections, “is a very common failing, I believe\n" +
                            "He has also _brotherly_ pride, which, with _some_ brotherly affection, makes him a very kind and careful guardian of his sister, and you will hear him generally cried up as the most attentive and best of brothers\n" +
                            "But perhaps,” added he, stopping in his walk, and turning towards her, “these offenses might have been overlooked, had not your pride been hurt by my honest confession of the scruples that had long prevented my forming any serious design\n" +
                            "Lydia's being settled in the North, just when she had expected most pleasure and pride in her company, for she had by no means given up her plan of their residing in Hertfordshire, was a severe disappointment; and, besides, it was such a pity that Lydia should be taken from a regiment where she was acquainted with everybody, and had so many favourites\n" +
                            "End of the Project Gutenberg EBook of Pride and Prejudice, by Jane Austen  *** END OF THIS PROJECT GUTENBERG EBOOK PRIDE AND PREJUDICE ***  ***** This file should be named 1342-0\n" +
                            "”  “That is very true,” replied Elizabeth, “and I could easily forgive _his_ pride, if he had not mortified _mine_\n" +
                            "If his own vanity, however, did not mislead him, _he_ was the cause, his pride and caprice were the cause, of all that Jane had suffered, and still continued to suffer\n" +
                            "Every kind of pride must revolt from the connection\n" +
                            "\uFEFFThe Project Gutenberg EBook of Pride and Prejudice, by Jane Austen  This eBook is for the use of anyone anywhere at no cost and with almost no restrictions whatsoever\n" +
                            "I was given good principles, but left to follow them in pride and conceit",
                    reader.lines().collect(Collectors.joining("\n"))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testNoOutputFile() {
        assertThrows(
                NullPointerException.class,
                () -> example.getOccurrences(
                        new String[] {
                                PATH + "input.txt"
                        },
                        new String[] {
                                "word"
                        },
                        null
                )
        );
    }

    @Test
    void testNoInputFile() {
        assertDoesNotThrow(
                () -> example.getOccurrences(
                        new String[] {
                                PATH + "non-existing_file.txt"
                        },
                        new String[] {
                                "word"
                        },
                        PATH + "output.txt"
                )
        );
    }

    @Test
    void testNoInputURL() {
        assertDoesNotThrow(
                () -> example.getOccurrences(
                        new String[] {
                                "http://non-existing_url.com"
                        },
                        new String[] {
                                "word"
                        },
                        PATH + "output.txt"
                )
        );
    }
}
