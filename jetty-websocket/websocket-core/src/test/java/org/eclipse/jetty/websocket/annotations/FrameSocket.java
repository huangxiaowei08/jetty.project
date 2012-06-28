package org.eclipse.jetty.websocket.annotations;

import org.eclipse.jetty.websocket.frames.BaseFrame;
import org.eclipse.jetty.websocket.frames.TextFrame;

@WebSocket
public class FrameSocket
{
    /**
     * The most basic frame type
     */
    @OnWebSocketFrame
    public void frameMe(BaseFrame frame)
    {
        /* ignore */
    }

    /**
     * Should allow for a more specific frame type as well.
     */
    @OnWebSocketFrame
    public void textMe(TextFrame frame)
    {
        /* ignore */
    }
}
