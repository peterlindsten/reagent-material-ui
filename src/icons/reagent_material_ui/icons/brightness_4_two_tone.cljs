(ns reagent-material-ui.icons.brightness-4-two-tone
  "Imports @material-ui/icons/Brightness4TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def brightness-4-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 9.52V6h-3.52L12 3.52 9.52 6H6v3.52L3.52 12 6 14.48V18h3.52L12 20.48 14.48 18H18v-3.52L20.48 12 18 9.52zM12.29 17c-.74 0-1.45-.17-2.08-.46 1.72-.79 2.92-2.52 2.92-4.54s-1.2-3.75-2.92-4.54c.63-.29 1.34-.46 2.08-.46 2.76 0 5 2.24 5 5s-2.24 5-5 5z", "opacity" ".3"}) (e "path" #js {"d" "M20 8.69V4h-4.69L12 .69 8.69 4H4v4.69L.69 12 4 15.31V20h4.69L12 23.31 15.31 20H20v-4.69L23.31 12 20 8.69zm-2 5.79V18h-3.52L12 20.48 9.52 18H6v-3.52L3.52 12 6 9.52V6h3.52L12 3.52 14.48 6H18v3.52L20.48 12 18 14.48zM12.29 7c-.74 0-1.45.17-2.08.46 1.72.79 2.92 2.53 2.92 4.54s-1.2 3.75-2.92 4.54c.63.29 1.34.46 2.08.46 2.76 0 5-2.24 5-5s-2.24-5-5-5z"}))
                                            "Brightness4TwoTone"))
