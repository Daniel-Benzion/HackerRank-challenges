public class DesignerPdfViewer {

	static int designerPdfViewer(int[] h, String word) {
		int max = 0;

		for (int i = 0; i < word.length(); i++) {
			if(max < h[word.charAt(i)-97]) max = h[word.charAt(i)-97];
		}
		return word.length() * max;
	}
}
