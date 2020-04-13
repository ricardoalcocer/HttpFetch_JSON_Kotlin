# Parsing JSON in Kotlin/Android

I found and followed this tutorial on how tu fetch JSON from a remote service, parse it and add it to a ListView in Kotlin/Android.

https://www.youtube.com/watch?v=amI5Cl4mskA&feature=share


## Loading JSON

1. Add ListView to layout file inside LinearLayout
	* ListViews have ListItems with its own Layout (its own xml)
2. Create New Layout file inside Layouts
	* Create TextViews for each value from the JSON file
		* @+id/pid
		* @+id/pname
		* @+id/pemail
		* @+id/plocation
3. Create Data Class
	* `data class MyData (val id: Int, val name: String, val email: String, val location: String)`

4. Create a List Adapter class to add items to list
	* Import context
	* Pass ArrayList<MyData>
	* Generate methods to implement
		* getView
			* Inflate layout created in step 2
			* Get reference to TextViews
			* Assign values from current position in ArrayList
			* return view
		* getItem
			* return position
		* getItemId
			* return position converted to long
		* getCount
			* return list.size
5. Learn about AsyncTask
	* Asynctask
		* onPreExecute
			* Show "Loading message"
		* doInBackground
			* 	
		* onPostExecute
			* Clean up	
6. On MainActivity
	* Create AsyncTaskHandler
	* Implement methods
		*  onPreExecute
			* show loading progress dialog
		*  doInBackground
			*  Open Internet connection and fetch data
		*  Private Function jsonResult
			*  Here we grab the JSON, create an ArrayList, loop through all and add them to the Array
		*  doPostExecute
			*  Here we have the JSON data from the Internet, so we call the jsonResult function with the data
			*  We also close the dialog
	* On onCreate, we call AsyncTaskHandler with the URL  	