package cn.Memo.memogank.View;

import java.util.List;

import cn.Memo.memogank.Entity.Results;


public interface ITextView extends IView {

	/**
	 * ��ʾ����
	 */
	void showText(List<Results> list);
}
