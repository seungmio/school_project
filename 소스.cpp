#include "opencv2/opencv.hpp"
#include <iostream>

using namespace cv;
using namespace std;

void ROI();

int main() {
	ROI();

	return 0;
}

void ROI() {
	Mat img1 = imread("lenna.bmp");
	Mat img1_before;
	Mat img_roi_1, img_roi_2, img_roi_3, img_roi_4, img_roi_5, img_roi_6, img_roi_7, img_roi_8;

	resize(img1, img1_before, Size(256, 256));
	Mat img1_after = img1_before.clone();

	img_roi_1 = img1_after(Rect(0, 0, 256, 25));
	img_roi_2 = img1_after(Rect(0, 25, 25, 206));
	img_roi_3 = img1_after(Rect(0, 231, 256, 25));
	img_roi_4 = img1_after(Rect(231, 25, 25, 206));
	img_roi_5 = img1_after(Rect(50, 50, 156, 25));
	img_roi_6 = img1_after(Rect(50, 75, 25, 106));
	img_roi_7 = img1_after(Rect(50, 181, 156, 25));
	img_roi_8 = img1_after(Rect(181, 75, 25, 106));

	img_roi_1.setTo(Scalar(0, 255, 0));
	img_roi_2.setTo(Scalar(0, 255, 0));
	img_roi_3.setTo(Scalar(0, 255, 0));
	img_roi_4.setTo(Scalar(0, 255, 0));
	img_roi_5.setTo(Scalar(255, 0, 0));
	img_roi_6.setTo(Scalar(255, 0, 0));
	img_roi_7.setTo(Scalar(255, 0, 0));
	img_roi_8.setTo(Scalar(255, 0, 0));
	

	imshow("img1_before", img1_before);
	imshow("img1_after", img1_after);
	//imshow("img_roi_1", img_roi_1);
	//imshow("img_roi_2", img_roi_2);
	//imshow("img_roi_3", img_roi_3);
	//imshow("img_roi_4", img_roi_4);
	waitKey();
}