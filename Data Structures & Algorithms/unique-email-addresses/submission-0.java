class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hashSet = new HashSet<>();

        for (int i=0; i<emails.length; i++){
            int idx = emails[i].indexOf("@");
            String localName = emails[i].substring(0, idx);
            String domain = emails[i].substring(idx);

            int plusIdx = localName.indexOf("+");
            if (plusIdx != -1){
                localName = localName.substring(0, plusIdx);
            }

            localName = localName.replace(".","");

            hashSet.add(localName+domain);
        }

        return hashSet.size();
    }
}