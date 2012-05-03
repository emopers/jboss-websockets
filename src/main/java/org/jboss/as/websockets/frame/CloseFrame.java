package org.jboss.as.websockets.frame;

import org.jboss.as.websockets.FrameType;

/**
 * @author Mike Brock
 */
public class CloseFrame extends AbstractFrame {
  public CloseFrame() {
    super(FrameType.ConnectionClose);
  }
}