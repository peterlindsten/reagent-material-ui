(ns reagent-material-ui.icons.list-alt-rounded
  "Imports @material-ui/icons/ListAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def list-alt-rounded (create-svg-icon (e "path" #js {"d" "M12 9h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h4c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zM7 7h2v2H7zm0 4h2v2H7zm0 4h2v2H7zM20 3H4c-.55 0-1 .45-1 1v16c0 .55.45 1 1 1h16c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zm-1 16H5V5h14v14z"})
                                       "ListAltRounded"))
