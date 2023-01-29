package eu.usrv.legacylootgames.gol.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import ru.timeconqueror.lootgames.client.IconLoader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eu.usrv.legacylootgames.gol.tiles.LegacyGameOfLightTile;

public class LegacyLightGameBlock extends Block implements ITileEntityProvider {

    public LegacyLightGameBlock() {
        super(Material.iron);
        setBlockUnbreakable();
        setBlockName("lightGame");
        setLightLevel(1.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return IconLoader.shieldedDungeonFloor;
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {}

    @Override
    public final boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World pWorld, int p_149915_2_) {
        return new LegacyGameOfLightTile();
    }
}
