import React, {useEffect, useState} from 'react';

const App = () => {
	const [fetchedData, setFetchData] = useState('');

	useEffect(() => {
		fetch('http://localhost:8080/potato/lies')
		.then (response => {
			if (response.ok) {
				return response.text();
			}
		})
		.then(data => {
			setFetchData(data);
		});
	},[]);

	return(<div>
		<h1>data goes below</h1>
		<p> {fetchedData} </p>
		</div>);
};
	

export default App;
