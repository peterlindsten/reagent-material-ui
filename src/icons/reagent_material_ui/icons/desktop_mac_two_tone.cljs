(ns reagent-material-ui.icons.desktop-mac-two-tone
  "Imports @material-ui/icons/DesktopMacTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def desktop-mac-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 4h18v10H3z", "opacity" ".3"}) (e "path" #js {"d" "M21 2H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h7l-2 3v1h8v-1l-2-3h7c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 12H3V4h18v10z"}))
                                           "DesktopMacTwoTone"))
