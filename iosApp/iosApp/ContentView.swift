import SwiftUI
import shared

struct ContentView: View {
    let greet = Greeting().greeting().fold(
        ifLeft: { message in message },
        ifRight: { message in message }
    ) as! String
    
	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
