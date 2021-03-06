(ns reagent-material-ui.icons.signal-wifi-4-bar-rounded
  "Imports @material-ui/icons/SignalWifi4BarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-4-bar-rounded (create-svg-icon (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4C5.28 3 .81 6.66.36 7l10.08 12.56c.8 1 2.32 1 3.12 0L23.64 7z"})
                                                "SignalWifi4BarRounded"))
