package net.thegaminghuskymc.sandboxgame.engine.graph.anim;

import java.util.List;

import net.thegaminghuskymc.sandboxgame.engine.blocks.GameBlock;
import net.thegaminghuskymc.sandboxgame.engine.graph.Mesh;
import net.thegaminghuskymc.sandboxgame.engine.items.GameItem;
import org.joml.Matrix4f;

public class AnimGameBlock extends GameBlock {

    private int currentFrame;
    
    private List<AnimatedFrame> frames;

    private List<Matrix4f> invJointMatrices;
    
    public AnimGameBlock(Mesh[] meshes, List<AnimatedFrame> frames, List<Matrix4f> invJointMatrices) {
        super(meshes);
        this.frames = frames;
        this.invJointMatrices = invJointMatrices;
        currentFrame = 0;
    }

    public List<AnimatedFrame> getFrames() {
        return frames;
    }

    public void setFrames(List<AnimatedFrame> frames) {
        this.frames = frames;
    }
    
    public AnimatedFrame getCurrentFrame() {
        return this.frames.get(currentFrame);
    }
    
    public AnimatedFrame getNextFrame() {
        int nextFrame = currentFrame + 1;    
        if ( nextFrame > frames.size() - 1) {
            nextFrame = 0;
        }
        return this.frames.get(nextFrame);
    }

    public void nextFrame() {
        int nextFrame = currentFrame + 1;    
        if ( nextFrame > frames.size() - 1) {
            currentFrame = 0;
        } else {
            currentFrame = nextFrame;
        }
    }    

    public List<Matrix4f> getInvJointMatrices() {
        return invJointMatrices;
    }
}
