package com.company;

public class LocalInnerClassButton {

    private String title;
    private OnClickListener onClickListener;

    public LocalInnerClassButton(String title) {//constructor
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
////the button is going to set onClickListener(), which was created to assign a object to a button
//in order to be able to handle that clicks, so we will create an interface for that
//using the OnClickListener field and calling .onClick()
    }

    public interface OnClickListener{
        public void onClick(String title);
    }
}
