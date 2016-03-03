package org.kymjs.chat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

import com.rockerhieu.emojicon.EmojiconEditText;

/**
 * Created by leoye on 3/3/16.
 */
public class CoreEmojiconEditText extends EmojiconEditText {
    public CoreEmojiconEditText(Context context) {
        super(context);
    }

    public CoreEmojiconEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CoreEmojiconEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs)
    {
        InputConnection conn = super.onCreateInputConnection(outAttrs);
        outAttrs.imeOptions &= ~EditorInfo.IME_FLAG_NO_ENTER_ACTION;
        return conn;
    }
}
