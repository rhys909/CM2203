//code that will perform the search

class search {
    public search(String input) {
        userInput = input;
    }

    public String getInput() {
        return userInput;
    }

    public String returnSearchResultXML() {
        return "<XML>" + userInput + "<\\XML>";
    }

    public String returnSearchResultHTML() {
        return "<HTML>" + userInput + "<\\HTML>";
    }

    public void userSearch(){
        //Add the search function here 
        System.out.println(userInput);
    }

    private String userInput;
    //create methods that take user input
    //add checks to ensure only 2000's music is output
    // one Genres "Rock" 
     //https://learningcentral.cf.ac.uk/bbcswebdav/pid-5337997-dt-content-rid-14468315_2/courses/1920-CM2203/CM2203%20Coursework%20Instructions%20and%20Marking%281%29.pdf
}   //dictionary(artists:dkjdjdjdjd, albums:ahshdshh, years:2002,)


// Artist dict("Britney Spears": [Pop, 0], "Jay Z": )
// Albums dict("Toxic": [2002, 0], )
