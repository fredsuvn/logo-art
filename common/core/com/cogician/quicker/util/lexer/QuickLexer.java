package com.cogician.quicker.util.lexer;

import java.util.List;

import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

import com.cogician.quicker.QuickParsingException;

/**
 * <p>
 * Quick lexical analyzer.
 * </p>
 * <p>
 * This parser will tokenize input string into a list of lexical tetrad includes lexeme, token, row and column number.
 * </p>
 *
 * @author Fred Suvn
 * @version 0.0.0, 2016-04-25T10:02:27+08:00
 * @since 0.0.0, 2016-04-25T10:02:27+08:00
 * @see QuickLexToken
 * @see QuickLexTetrad
 */
@Immutable
@ThreadSafe
public interface QuickLexer {

    /**
     * <p>
     * Tokenizes given input string into a list of lexical tetrad which includes lexeme, token, row and column number.
     * </p>
     * 
     * @param input
     *            given input string
     * @return a list of lexical tetrad which includes lexeme, token, row and column number
     * @throws NullPointerException
     *             if given input string is null
     * @throws QuickParsingException
     *             if any problem occurs when tokenizing
     * @since 0.0.0
     */
    public List<QuickLexTetrad> tokenize(String input) throws NullPointerException, QuickParsingException;

}
