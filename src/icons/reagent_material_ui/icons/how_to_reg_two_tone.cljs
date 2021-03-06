(ns reagent-material-ui.icons.how-to-reg-two-tone
  "Imports @material-ui/icons/HowToRegTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def how-to-reg-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "8", "r" "2", "cx" "11", "opacity" ".3"}) (e "path" #js {"d" "M5 18h4.99L9 17l.93-.94C7.55 16.33 5.2 17.37 5 18z", "opacity" ".3"}) (e "path" #js {"d" "M11 12c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm0-6c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm-1 12H5c.2-.63 2.55-1.67 4.93-1.94h.03l.46-.45L12 14.06c-.39-.04-.68-.06-1-.06-2.67 0-8 1.34-8 4v2h9l-2-2zm10.6-5.5l-5.13 5.17-2.07-2.08L12 17l3.47 3.5L22 13.91z"}))
                                          "HowToRegTwoTone"))
