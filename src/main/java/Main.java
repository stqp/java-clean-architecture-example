import jp.co.myapp.infra.ui.UserCreateConsoleView;
import jp.co.myapp.interfaces.controllers.UserController;
import jp.co.myapp.interfaces.gateways.IUserCreateView;
import jp.co.myapp.interfaces.gateways.UserCreateViewModel;
import jp.co.myapp.interfaces.gateways.UserRepository;
import jp.co.myapp.interfaces.presentation.user.UserCreatePresentor;
import jp.co.myapp.useCases.user.create.IUserCreateUseCase;
import jp.co.myapp.useCases.user.create.UserCreateUseCaseInteractor;

public class Main {
	public static void main(String[] args) {

		IUserCreateView view = new UserCreateConsoleView();
		UserCreateViewModel viewModel = new UserCreateViewModel();
		viewModel.addObserver(view);
		
		UserCreatePresentor presentor = new UserCreatePresentor(viewModel);
		UserRepository repo = new UserRepository();
		IUserCreateUseCase useCase = new UserCreateUseCaseInteractor(repo, presentor);
		
		UserController controller = new UserController(useCase);
		controller.createUser("test user");

	}
}
