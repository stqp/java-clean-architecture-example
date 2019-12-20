package jp.co.myapp;

import jp.co.myapp.application.user.IUserRepository;
import jp.co.myapp.application.user.create.IUserCreateUseCase;
import jp.co.myapp.application.user.create.UserCreateUseCaseInteractor;
import jp.co.myapp.application.volume.IVolumeRepository;
import jp.co.myapp.application.volume.create.IVolumeCreatePresentor;
import jp.co.myapp.application.volume.create.IVolumeCreateUseCase;
import jp.co.myapp.application.volume.create.VolumeCreateUseCaseInteractor;
import jp.co.myapp.infra.ui.user.create.UserCreateConsoleView;
import jp.co.myapp.infra.ui.volume.create.VolumeCreateHTMLView;
import jp.co.myapp.interfaces.controllers.user.UserController;
import jp.co.myapp.interfaces.controllers.volume.VolumeController;
import jp.co.myapp.interfaces.gateways.user.UserRepository;
import jp.co.myapp.interfaces.gateways.user.create.IUserCreateView;
import jp.co.myapp.interfaces.gateways.user.create.IUserCreateViewModel;
import jp.co.myapp.interfaces.gateways.user.create.UserCreateViewModel;
import jp.co.myapp.interfaces.gateways.volume.VolumeRepository;
import jp.co.myapp.interfaces.gateways.volume.create.IVolumeCreateView;
import jp.co.myapp.interfaces.gateways.volume.create.IVolumeCreateViewModel;
import jp.co.myapp.interfaces.gateways.volume.create.VolumeCreateViewModel;
import jp.co.myapp.interfaces.presentation.user.create.UserCreatePresentor;
import jp.co.myapp.interfaces.presentation.volume.create.VolumeCreatePresentor;

public class Main {

	public static void main(String[] args) {
		// userCreateUseCase();
		volumeCreateUseCase();
	}

	public static void userCreateUseCase() {
		IUserCreateView view = new UserCreateConsoleView();
		IUserCreateViewModel viewModel = (new UserCreateViewModel()).addObserver(view);
		jp.co.myapp.application.user.create.IUserCreatePresentor presentor = new UserCreatePresentor(viewModel);
		IUserRepository repo = new UserRepository();
		IUserCreateUseCase useCase = new UserCreateUseCaseInteractor(repo, presentor);

		UserController controller = new UserController(useCase);
		controller.createUser("user0001");
	}

	public static void volumeCreateUseCase() {
		// IVolumeCreateView view = new VolumeCreateConsoleView();
		IVolumeCreateView view = new VolumeCreateHTMLView();
		IVolumeCreateViewModel viewModel = (new VolumeCreateViewModel()).addObserver(view);
		IVolumeCreatePresentor presentor = new VolumeCreatePresentor(viewModel);
		IVolumeRepository repo = new VolumeRepository();
		IVolumeCreateUseCase useCase = new VolumeCreateUseCaseInteractor(repo, presentor);

		VolumeController controller = new VolumeController(useCase);
		controller.createVolume("stokuda", 1000);
	}

}
