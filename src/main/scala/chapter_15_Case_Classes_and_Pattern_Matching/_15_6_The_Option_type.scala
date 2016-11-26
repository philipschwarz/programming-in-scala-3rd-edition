
 val capitals = Map("France" -> "Paris",
                    "Japan"  -> "Tokyo")

 capitals get "France"
 // res0: Option[String] = Some(Paris)

 capitals get "North Pole"
 // res1: Option[String] = None

 def show(x: Option[String]) = x match {
   case Some(s) => s
   case None => "?"
 }

 show(capitals get "Japan")
 // res2: String = Tokyo

 show(capitals get "North Pole")
 // res3: String = ?