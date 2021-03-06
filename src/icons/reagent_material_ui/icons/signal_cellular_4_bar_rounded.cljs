(ns reagent-material-ui.icons.signal-cellular-4-bar-rounded
  "Imports @material-ui/icons/SignalCellular4BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-cellular-4-bar-rounded (create-svg-icon (e "path" #js {"d" "M4.41 22H20c1.1 0 2-.9 2-2V4.41c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71z"})
                                                    "SignalCellular4BarRounded"))
