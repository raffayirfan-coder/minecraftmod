package skiie_com.raffayirfan.Mainmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;

public class BaseHorizontalBlock extends Block {

	public static final DirectionProperty HORIZONTAL_FACING=BlockStateProperties.HORIZONTAL_FACING;
	public BaseHorizontalBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().getBlockState().setValue(HORIZONTAL_FACING, Direction.NORTH ));
	}
}