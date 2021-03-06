package net.thegaminghuskymc.sandboxgame.engine.graph.particles;

import net.thegaminghuskymc.sandboxgame.engine.items.GameItem;

import java.util.List;

public interface IParticleEmitter {

    void cleanup();
    
    Particle getBaseParticle();
    
    List<GameItem> getParticles();
}
