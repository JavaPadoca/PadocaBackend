package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene homeManagerScene;
	private static Scene paymentsScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			
			primaryStage.setTitle("Padaria Memes");
			
			casting();
			
			primaryStage.setScene(homeManagerScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// FUNCTION DE CARREGAMENTO DE TELAS
	public static void casting() throws IOException {
		homeManagerScene = loadScene("HomeManager");
		paymentsScene = loadScene("payments");
	}
	
	public static void changeScene(String scn){
		switch (scn) {
		case "home":
			stage.setScene(homeManagerScene);
		case "payments":
			stage.setScene(paymentsScene);
		// ADICIONAR OUTRAS TELAS 
		}
	}
	
	// FUNCTION DE CRIAÇÃO DE TELAS
    private static Scene loadScene(String fxml) throws IOException {
        FXMLLoader Loader = new FXMLLoader(Main.class.getResource("../views/" + fxml + ".fxml"));
        return new Scene(Loader.load(), 1600, 900);
    }

	
	public static void main(String[] args) {
		launch(args);
	}
}
