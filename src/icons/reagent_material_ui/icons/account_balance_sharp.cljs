(ns reagent-material-ui.icons.account-balance-sharp
  "Imports @material-ui/icons/AccountBalanceSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def account-balance-sharp (create-svg-icon (e "path" #js {"d" "M4 10v7h3v-7H4zm6 0v7h3v-7h-3zM2 22h19v-3H2v3zm14-12v7h3v-7h-3zm-4.5-9L2 6v2h19V6l-9.5-5z"})
                                            "AccountBalanceSharp"))
