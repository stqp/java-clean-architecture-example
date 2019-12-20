package jp.co.myapp.interfaces.presentation.volume.create;

import jp.co.myapp.interfaces.gateways.volume.create.IVolumeCreateViewModel;
import jp.co.myapp.usecases.volume.create.IVolumeCreatePresentor;
import jp.co.myapp.usecases.volume.create.VolumeCreateOutputData;

public class VolumeCreatePresentor implements IVolumeCreatePresentor {

	private IVolumeCreateViewModel viewModel;

	public VolumeCreatePresentor(IVolumeCreateViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public void complete(VolumeCreateOutputData output) {
		viewModel.id(output.id());
		viewModel.capacityByte(output.capacityByte());
		viewModel.error(output.error());
		viewModel.owner(output.owner());
		viewModel.usedPercentage(output.usedPercentage());
		viewModel.notifyObservers();
	}

}