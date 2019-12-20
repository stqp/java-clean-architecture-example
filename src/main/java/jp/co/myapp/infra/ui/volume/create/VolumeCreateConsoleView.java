package jp.co.myapp.infra.ui.volume.create;

import jp.co.myapp.interfaces.gateways.volume.create.IVolumeCreateView;
import jp.co.myapp.interfaces.gateways.volume.create.VolumeCreateViewModel;

public class VolumeCreateConsoleView implements IVolumeCreateView{

	public void update(VolumeCreateViewModel viewModel) {
		System.out.println("id : " + viewModel.id());
		System.out.println("capacityByte : " + viewModel.capacityByte());
		System.out.println("usedPercentage : " + viewModel.usedPercentage());
		System.out.println("owner : " + viewModel.owner());
		System.out.println("error : " + viewModel.error());
	}

}
