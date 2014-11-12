package designing;

import java.util.Arrays;
import java.util.List;

import designing.Asset.AssetType;

public class AssetUtil {
	public static int totalAssetValues(final List<Asset> assets) {
		return assets.stream().mapToInt(Asset::getValue).sum();
	}

	public static void main(String[] args) {
		final List<Asset> assets = Arrays.asList(new Asset(AssetType.BOND, 1000), new Asset(AssetType.BOND, 2000),
				new Asset(AssetType.STOCK, 3000), new Asset(AssetType.STOCK, 4000));
		System.out.println(totalAssetValues(assets));
	}
}
