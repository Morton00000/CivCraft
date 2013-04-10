package civcraft.enums;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ToolsEnum {

	public static EnumToolMaterial toolFLINT = EnumHelper.addToolMaterial("FLINT", 2, 20, 1F, 0, 5);

	public static EnumToolMaterial toolALUMINUM = EnumHelper.addToolMaterial("ALUMINUM", 1, 100, 10F, 0, 18);

	public static EnumToolMaterial toolCOPPER = EnumHelper.addToolMaterial("COPPER", 1, 150, 3F, 1, 10);

	public static EnumToolMaterial toolBRONZE = EnumHelper.addToolMaterial("BRONZE", 2, 300, 6F, 2, 14);

	public static EnumToolMaterial toolDURANIUM = EnumHelper.addToolMaterial("DURANIUM", 3, 400, 10F, 4, 22);

	public static EnumToolMaterial toolSTEEL = EnumHelper.addToolMaterial("STEEL", 2, 550, 7F, 2, 16);

	public static EnumToolMaterial toolTITANIUM = EnumHelper.addToolMaterial("TITANIUM", 3, 1000, 8F, 3, 18);

	public static EnumToolMaterial toolCARBIDE = EnumHelper.addToolMaterial("CARBIDE", 3, 1500, 10F, 3, 16);

	public static EnumToolMaterial toolDCARBIDE = EnumHelper.addToolMaterial("DCARBIDE", 3, 2000, 12F, 4, 18);

}
