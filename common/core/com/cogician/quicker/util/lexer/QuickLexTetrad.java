package com.cogician.quicker.util.lexer;

import java.io.Serializable;

import javax.annotation.concurrent.Immutable;

import com.cogician.quicker.Quicker;
import com.cogician.quicker.QuickerUniform;

/**
 * <p>
 * Tetrad for lexical analysis, including lexeme, token, row number and column number.
 * </p>
 *
 * @author Fred Suvn
 * @version 0.0.0, 2016-04-25T10:35:09+08:00
 * @since 0.0.0, 2016-04-25T10:35:09+08:00
 */
@Immutable
public class QuickLexTetrad implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String lexeme;

    private final QuickLexToken token;

    private final int row;

    private final int column;

    /**
     * <p>
     * Constructs a new instance with given lexeme and token.
     * </p>
     * 
     * @param lexeme
     *            given lexeme
     * @param token
     *            given token
     * @throws NullPointerException
     *             if given lexeme or token is null
     * @since 0.0.0
     */
    public QuickLexTetrad(String lexeme, QuickLexToken token) throws NullPointerException {
        this.lexeme = Quicker.require(lexeme);
        this.token = Quicker.require(token);
        this.row = QuickerUniform.INVALID_CODE;
        this.column = QuickerUniform.INVALID_CODE;
    }

    /**
     * <p>
     * Constructs a new instance with given lexeme, token, row number and column number.
     * </p>
     * 
     * @param lexeme
     *            given lexeme
     * @param token
     *            given token
     * @param row
     *            given row number
     * @param column
     *            given column number
     * @throws NullPointerException
     *             if given lexeme or token is null
     * @since 0.0.0
     */
    public QuickLexTetrad(String lexeme, QuickLexToken token, int row, int column) throws NullPointerException {
        this.lexeme = Quicker.require(lexeme);
        this.token = Quicker.require(token);
        this.row = row;
        this.column = column;
    }

    /**
     * <p>
     * Returns lexeme of this lexcial tetrad.
     * </p>
     * 
     * @return lexeme of this lexcial tetrad
     * @since 0.0.0
     */
    public String getLexeme() {
        return lexeme;
    }

    /**
     * <p>
     * Returns token of this lexcial tetrad.
     * </p>
     * 
     * @return token of this lexcial tetrad
     * @since 0.0.0
     */
    public QuickLexToken getToken() {
        return token;
    }

    /**
     * <p>
     * Returns row number of this lexcial tetrad. If returned number is {@linkplain QuickerUniform#INVALID_CODE}, it means the
     * row number is invalid or has not been recorded.
     * </p>
     * 
     * @return row number of this lexcial tetrad
     * @since 0.0.0
     */
    public int getRow() {
        return row;
    }

    /**
     * <p>
     * Returns column number of this lexcial tetrad. If returned number is {@linkplain QuickerUniform#INVALID_CODE}, it means
     * the column number is invalid or has not been recorded.
     * </p>
     * 
     * @return column number of this lexcial tetrad
     * @since 0.0.0
     */
    public int getColumn() {
        return column;
    }

    /**
     * <p>
     * Returns a string simply represents this tetrad: {lexeme, token name, row ,column}.
     * </p>
     * 
     * @return a string simply represents this tetrad
     * @since 0.0.0
     */
    @Override
    public String toString() {
        return "{" + getLexeme() + ", " + getToken().getName() + ", " + getRow() + ", " + getColumn() + "}";
    }
}
