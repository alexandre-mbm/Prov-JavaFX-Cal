package app.timeline;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.scene.control.TableColumn;

import app.Timeline;

public class MonthTimeline implements Timeline {

	public MonthTimeline(Date startDate) {
		System.out.format("MonthTimeline - %s\n", startDate);
	}

	public List<TableColumn<Integer, String>> getColumns() {
		List<TableColumn<Integer, String>> list  = new ArrayList<TableColumn<Integer, String>>();
		for (int i = 0; i<31;i++) {
			TableColumn<Integer, String> t = new TableColumn<>(Integer.toString(i));
			list.add(t);
		}
		return list;
	}
}
