package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.TextFields;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import jsonStringGenerator.Finder;
import jsonStringGenerator.UrlStringModifiers;
import playerData.GameLogFactory;
import playerData.GoalStats;
import playerData.Person;
import playerData.Stats;

public class MainController implements Initializable {

	private Finder finder;
//	ArrayList<String> league = finder.createIsles();

//	Map<Integer, String> league = finder.createLeagueRoster();

	// FXML for plain stat display
	@FXML
	private TextField nameTextField;
	@FXML
	private ChoiceBox<String> yearChoiceBox;
	@FXML
	private Button displayButton;
	@FXML
	private TextArea goalsTextArea;
	@FXML
	private TextArea assistsTextArea;
	@FXML
	private TextArea pointsTextArea;
	@FXML
	private TextArea toiTextArea;
	@FXML
	private TextArea shotsTextArea;
	@FXML
	private TextArea hitsTextArea;
	@FXML
	private TextArea ppgTextArea;
	@FXML
	private TextArea shgTextArea;
	@FXML
	private TextArea gwgTextArea;
	@FXML
	private TextArea plusMinusTextArea;
	@FXML
	private TextArea blocksTextArea;
	@FXML
	private TextArea shootingPercentageTextArea;
	@FXML
	private TextArea goalsFirstPeriodTextArea;
	@FXML
	private TextArea goalsSecondPeriodTextArea;
	@FXML
	private TextArea goalsThirdPeriodTextArea;
	@FXML
	private TextArea goalsOvertimeTextArea;
	@FXML
	private PieChart goalsByPeriodPieChart;
	@FXML
	private PieChart goalsByScorePieChart;
	@FXML
	private TextArea engTextArea;
	@FXML
	private TextArea goalsLeadingByOneTextArea;
	@FXML
	private TextArea goalsLeadingByTwoTextArea;
	@FXML
	private TextArea goalsLeadingByThreePlusTextArea;
	@FXML
	private TextArea goalsTrailingByOneTextArea;
	@FXML
	private TextArea goalsTrailingByTwoTextArea;
	@FXML
	private TextArea goalsTrailingByThreePlusTextArea;
	@FXML
	private TextArea goalsWhenTiedTextArea;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		finder = new Finder();

		ArrayList<String> league = finder.createSkaterRoster();

		TextFields.bindAutoCompletion(nameTextField, league);

	}

	@FXML
	public void displayButtonClick(ActionEvent e) {
		Person person = finder.findPlayer(nameTextField.getText());
		String link = person.getLink();
		Stats playerStats = GameLogFactory.getStatDataFromURL(UrlStringModifiers.getStatUrlFromLink(link,
				Integer.valueOf(yearChoiceBox.getSelectionModel().getSelectedItem())));
		GoalStats playerGoalStats = GameLogFactory.getGoalStatDataFromURL(UrlStringModifiers
				.getGoalStatUrlFromLink(link, Integer.valueOf(yearChoiceBox.getSelectionModel().getSelectedItem())));
		goalsTextArea.setText(playerStats.getGoals().toString());
		assistsTextArea.setText(playerStats.getAssists().toString());
		pointsTextArea.setText(playerStats.getPoints().toString());
		toiTextArea.setText(playerStats.getToi().toString());
		shotsTextArea.setText(playerStats.getShots().toString());
		hitsTextArea.setText(playerStats.getHits().toString());
		ppgTextArea.setText(playerStats.getPowerPlayGoals().toString());
		shgTextArea.setText(playerStats.getShortHandedGoals().toString());
		gwgTextArea.setText(playerStats.getGameWinningGoals().toString());
		plusMinusTextArea.setText(playerStats.getPlusMinus().toString());
		blocksTextArea.setText(playerStats.getBlocked().toString());
		shootingPercentageTextArea.setText(playerStats.getShotPct().toString());

		fillGoalsByPeriodChart(goalsByPeriodPieChart, playerGoalStats);
//		fillGoalsByScoreChart(goalsByScorePieChart, playerGoalStats);

		fillEngTextArea(engTextArea, playerGoalStats);

	}

	public void fillEngTextArea(TextArea textArea, GoalStats stats) {
		if (stats.getEmptyNetGoals() == null) {
			engTextArea.setText("0");

		} else {

			engTextArea.setText(stats.getEmptyNetGoals().toString());

		}

	}

	public void fillGoalsByPeriodChart(PieChart chart, GoalStats stats) {
		goalsFirstPeriodTextArea.clear();
		goalsSecondPeriodTextArea.clear();
		goalsThirdPeriodTextArea.clear();
		goalsOvertimeTextArea.clear();
		chart.getData().clear();

		ObservableList<PieChart.Data> goalsByPeriodPieChartData = FXCollections.observableArrayList();
		
		if (stats.getGoalsFirstPeriod() != null && stats.getGoalsFirstPeriod() != 0) {
			PieChart.Data firstPeriodGoalsPieChartData = new PieChart.Data("1st", stats.getGoalsFirstPeriod());
			goalsByPeriodPieChartData.add(firstPeriodGoalsPieChartData);
			chart.getData().add(firstPeriodGoalsPieChartData);
			goalsFirstPeriodTextArea.setText(stats.getGoalsFirstPeriod().toString());

		} else {
			goalsFirstPeriodTextArea.setText("0");
		}

		if (stats.getGoalsSecondPeriod() != null && stats.getGoalsSecondPeriod() != 0) {
			PieChart.Data secondPeriodGoalsPieChartData = new PieChart.Data("2nd", stats.getGoalsSecondPeriod());
			goalsByPeriodPieChartData.add(secondPeriodGoalsPieChartData);
			chart.getData().add(secondPeriodGoalsPieChartData);
			goalsSecondPeriodTextArea.setText(stats.getGoalsSecondPeriod().toString());

		} else {
			goalsSecondPeriodTextArea.setText("0");
		}
		if (stats.getGoalsThirdPeriod() != null && stats.getGoalsThirdPeriod() != 0) {
			PieChart.Data thirdPeriodGoalsPieChartData = new PieChart.Data("3rd", stats.getGoalsThirdPeriod());
			goalsByPeriodPieChartData.add(thirdPeriodGoalsPieChartData);
			chart.getData().add(thirdPeriodGoalsPieChartData);
			goalsThirdPeriodTextArea.setText(stats.getGoalsThirdPeriod().toString());

		} else {
			goalsThirdPeriodTextArea.setText("0");
		}
		if (stats.getGoalsOvertimePeriod() != null && stats.getGoalsOvertimePeriod() != 0) {
			PieChart.Data overtimePeriodGoalsPieChartData = new PieChart.Data("OT", stats.getGoalsOvertimePeriod());
			goalsByPeriodPieChartData.add(overtimePeriodGoalsPieChartData);
			chart.getData().add(overtimePeriodGoalsPieChartData);
			goalsOvertimeTextArea.setText(stats.getGoalsOvertimePeriod().toString());

		} else {
			goalsOvertimeTextArea.setText("0");
		}

	}

	public void fillGoalsByScoreChart(PieChart chart, GoalStats stats) {
		goalsLeadingByOneTextArea.clear();
		goalsLeadingByTwoTextArea.clear();
		goalsLeadingByThreePlusTextArea.clear();
		goalsTrailingByOneTextArea.clear();
		goalsTrailingByTwoTextArea.clear();
		goalsTrailingByThreePlusTextArea.clear();
		goalsWhenTiedTextArea.clear();

		chart.getData().clear();
		
		
		ObservableList<PieChart.Data> goalsByScorePieChartData = FXCollections.observableArrayList();

		if (stats.getGoalsLeadingByOne() != null && stats.getGoalsLeadingByOne() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Leading by 1", stats.getGoalsLeadingByOne());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsLeadingByOneTextArea.setText(stats.getGoalsLeadingByOne().toString());
		} else {
			goalsLeadingByOneTextArea.setText("0");
		}

		if (stats.getGoalsLeadingByTwo() != null && stats.getGoalsLeadingByTwo() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Leading by 2", stats.getGoalsLeadingByTwo());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsLeadingByTwoTextArea.setText(stats.getGoalsLeadingByTwo().toString());
		} else {
			goalsLeadingByTwoTextArea.setText("0");
		}

		if (stats.getGoalsLeadingByThreePlus() != null && stats.getGoalsLeadingByThreePlus() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Leading by 3+", stats.getGoalsLeadingByThreePlus());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsLeadingByThreePlusTextArea.setText(stats.getGoalsLeadingByThreePlus().toString());
		} else {
			goalsLeadingByThreePlusTextArea.setText("0");
		}

		if (stats.getGoalsTrailingByOne() != null && stats.getGoalsTrailingByOne() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Trailing by 1", stats.getGoalsTrailingByOne());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsTrailingByOneTextArea.setText(stats.getGoalsTrailingByOne().toString());
		} else {
			goalsTrailingByOneTextArea.setText("0");
		}

		if (stats.getGoalsTrailingByTwo() != null && stats.getGoalsTrailingByTwo() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Trailing by 2", stats.getGoalsTrailingByTwo());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsTrailingByTwoTextArea.setText(stats.getGoalsTrailingByTwo().toString());
		} else {
			goalsTrailingByTwoTextArea.setText("0");
		}

		if (stats.getGoalsTrailingByThreePlus() != null && stats.getGoalsTrailingByThreePlus() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Trailing by 3+", stats.getGoalsTrailingByThreePlus());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsTrailingByThreePlusTextArea.setText(stats.getGoalsTrailingByThreePlus().toString());
		} else {
			goalsTrailingByThreePlusTextArea.setText("0");
		}

		if (stats.getGoalsWhenTied() != null &&  stats.getGoalsWhenTied() != 0) {
			PieChart.Data pieChartData = new PieChart.Data("Tied", stats.getGoalsLeadingByOne());
			goalsByScorePieChartData.add(pieChartData);
			chart.getData().add(pieChartData);
			goalsWhenTiedTextArea.setText(stats.getGoalsLeadingByOne().toString());
		} else {
			goalsWhenTiedTextArea.setText("0");
		}

	}

	@FXML
	public void fillYearChoiceBox(ActionEvent e) {

		yearChoiceBox.getItems().clear();
		Person person = finder.findPlayer(nameTextField.getText());
		String link = person.getLink();
		Integer year = 2000;
		while (GameLogFactory.getStatDataFromURL(UrlStringModifiers.getStatUrlFromLink(link, year))
				.getGamesPlayed() == 0) {
			year++;
		}
		Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
		while (year < currentYear) {
			year++;
			yearChoiceBox.getItems().add(year.toString());
		}
//		ArrayList<String> yearsPlayed = person.
//		yearChoiceBox.getChildrenUnmodifiable().addAll(c)
	}

//	public void populatePieCharts(ActionEvent e) {
//		   // TODO
//		 ObservableList<PieChart.Data> pieChartData =
//		            FXCollections.observableArrayList(
//		            new PieChart.Data("1st Period Goals", playerGoalStats.),
//		            new PieChart.Data("Passed", 25),
//		            new PieChart.Data("Fails", 15));
//
//		 goalsByPeriodPieChart.setData(pieChartData);
//	}

//	private void initialize(URL url, ResourceBundle rb) {
//
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("bob");
//		names.add("bully");
//
//		TextFields.bindAutoCompletion(nameTextField, "text");
//
//	}
}
