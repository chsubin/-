import java.util.Arrays;

class Solution {
    public int solution(int sticker[]) {
    	int stickerSize = sticker.length;
    	if (stickerSize <= 3) {
    		Arrays.sort(sticker);
    		return sticker[stickerSize-1];
    	}
    	else {
    		int[] tear1 = new int[stickerSize];
    		tear1[0] = tear1[1] = sticker[0];
    		int[] tear2 = new int[stickerSize];
    		tear2[0] = 0; tear2[1] = sticker[1];
    		
    		for (int i = 2; i < stickerSize-1; i++) {
    			tear1[i] = Math.max(tear1[i-2]+sticker[i], tear1[i-1]);
    			tear2[i] = Math.max(tear2[i-2]+sticker[i], tear2[i-1]);
    		}
    		
    		int max1 = Math.max(tear1[stickerSize-2], tear1[stickerSize-3]);
            int max2 = Math.max(tear2[stickerSize-2], tear2[stickerSize-3]+sticker[stickerSize-1]);
    		return Math.max(max1, max2);
    	}
    }
}