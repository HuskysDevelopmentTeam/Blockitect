package net.thegaminghuskymc.sandboxgame.engine.resources.data;

import net.thegaminghuskymc.sandboxgame.engine.modding.Side;
import net.thegaminghuskymc.sandboxgame.engine.modding.SideOnly;

@SideOnly(Side.CLIENT)
public class TextureMetadataSection implements IMetadataSection
{
    private final boolean textureBlur;
    private final boolean textureClamp;

    public TextureMetadataSection(boolean textureBlurIn, boolean textureClampIn)
    {
        this.textureBlur = textureBlurIn;
        this.textureClamp = textureClampIn;
    }

    public boolean getTextureBlur()
    {
        return this.textureBlur;
    }

    public boolean getTextureClamp()
    {
        return this.textureClamp;
    }
}