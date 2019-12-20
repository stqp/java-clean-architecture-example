package jp.co.myapp.infra.ui.volume.create;

import jp.co.myapp.interfaces.gateways.volume.create.IVolumeCreateView;
import jp.co.myapp.interfaces.gateways.volume.create.VolumeCreateViewModel;

public class VolumeCreateHTMLView implements IVolumeCreateView {

	public void update(VolumeCreateViewModel model) {
		String cnt = "";
		cnt += tag("h1", model.id());
		cnt += tag("h2", model.capacityByte());
		cnt += tag("h3", model.usedPercentage());
		cnt += tag("h4", model.owner());
		cnt += tag("h5", model.error());
		cnt = tag("html", cnt);
		System.out.println(cnt);
	}

	private String tag(String tag, Object internal) {
		return "<" + tag + ">" + internal + "</" + tag + ">";
	}

}
